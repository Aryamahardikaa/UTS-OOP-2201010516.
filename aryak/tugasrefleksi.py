import cv2
from cv2 import waitKey
import numpy as np


img = cv2.imread("doraemon.PNG")

# Refleksi horizontal
refleksi_horizontal = cv2.flip(img, 1)
cv2.imshow('Refleksi Horizontal', refleksi_horizontal)
cv2.waitKey(0)

# Refleksi vertikal
refleksi_vertikal = cv2.flip(img, 0)
cv2.imshow('Refleksi Vertikal', refleksi_vertikal)
cv2.waitKey(0)

cv2.destroyAllWindows()
