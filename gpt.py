import numpy as np
import matplotlib.pyplot as plt
import matplotlib.animation as animation
#正态分布的动画
fig, ax = plt.subplots()
x = np.arange(-4, 4, 0.01)
line, = ax.plot(x, np.exp(-x**2))

def animate(i):
    line.set_ydata(np.exp(-x**2 + i/10.0))
    return line,

def init():
    line.set_ydata(np.exp(-x**2))
    return line,

ani = animation.FuncAnimation(fig, animate, np.arange(1, 200), init_func=init, interval=20, blit=True)

plt.show()
