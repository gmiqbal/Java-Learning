from PIL import Image

# Load the PNG file containing the four photos
img = Image.open(r"C:\Users\gmiqb\Downloads\111.png")

# Convert the image to grayscale to simplify segmentation
img = img.convert("L")

# Threshold the image to separate the foreground (photos) from the background (white)
img = img.point(lambda x: 255 if x > 200 else 0, mode='1')

# Find the bounding boxes for each photo in the image
bbox_list = []
bbox = None
for y in range(img.size[1]):
    if not bbox and 0 in img.crop((0, y, img.size[0], y+1)).getcolors():
        bbox = [0, y, img.size[0], y+1]
    elif bbox and not 0 in img.crop((0, y, img.size[0], y+1)).getcolors():
        bbox[3] = y
        bbox_list.append(tuple(bbox))
        bbox = None

# Crop each photo and save it to a separate file
for i, bbox in enumerate(bbox_list):
    img_crop = img.crop(bbox)
    img_crop.save(f"scanned_photos/photo_{i+1}.png")
