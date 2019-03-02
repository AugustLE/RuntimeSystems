import numpy as np
from PIL import Image
import datetime

def show(data):
    img = Image.frombytes('1', data.shape[::-1], np.packbits(data, 1))
    img.show()


print('\nSTARTED AT: ')
start_time = datetime.datetime.now()
print(start_time)
print('\n')
n = 15000
maxiter = 100

M = np.zeros([n, n], np.uint8)
xvalues = np.linspace(-2, 2, n)
yvalues = np.linspace(-2, 2, n)

for u, x in enumerate(xvalues):
    for v, y in enumerate(yvalues):
        z = 0
        c = complex(x, y)
        for i in range(maxiter):
            z = z*z + c
            if abs(z) > 2.0:
                M[v, u] = 1
                break

print('\nFINISHED AT: ')
end_time = datetime.datetime.now()
print(end_time - start_time)
print('\n')
show(M)
