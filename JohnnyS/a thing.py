import cv2 as cv
from PIL import Image

cap = cv.VideoCapture(0)
if not cap.isOpened():
    print("Cannot open camera")
    exit()


def toArt(image):


    # Define the ASCII character set to use for the conversion
    ASCII_CHARS = [' ', '.', ',', ':', ';', '+', '*', '?', '%', 'S', '#', '@', '$', '&', '8']


    # Determine the new dimensions while maintaining aspect ratio
    width, height = image.size
    aspect_ratio = height / width
    new_width = min(width, 120)
    new_height = int(aspect_ratio * new_width * 0.5)

    # Resize the image
    image = image.resize((new_width, new_height))

    # Convert the image to grayscale
    image = image.convert('L')

    # Calculate the range of pixel values in the image
    pixel_min, pixel_max = image.getextrema()
    pixel_range = pixel_max - pixel_min

    # Map the pixel values to ASCII characters
    pixels = image.getdata()
    ascii_chars = [ASCII_CHARS[int((pixel - pixel_min) * 14 / pixel_range)] for pixel in pixels]
    ascii_chars = ''.join(ascii_chars)

    # Print the ASCII art to the console
    for i in range(0, len(ascii_chars), new_width):
        print(ascii_chars[i:i + new_width])
while True:
    # Boilerplate Code
    ret, frame = cap.read()
    if not ret:
        print("Can't receive frame (stream end?). Exiting ...")
        break
    if cv.waitKey(1) == 27:
        break

    img = cv.cvtColor(frame, cv.COLOR_BGR2RGB)
    img_pil = Image.fromarray(img)

    print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
    toArt(img_pil)


# When everything done, release the capture
cap.release()
cv.destroyAllWindows()
