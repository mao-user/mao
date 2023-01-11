import pyautogui
import time

# 设置要连续点击的位置和连点的频率
click_position = (120, 100)
click_frequency = 10

# 循环执行点击操作
while True:
    # 点击屏幕上指定的位置
    pyautogui.click(click_position)
    # 等待一段时​
