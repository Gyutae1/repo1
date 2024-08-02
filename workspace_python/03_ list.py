a= [1, 1.2, 'word', True]
print(a)
print(a[1])
# print(a[10]) # 범위를 벗어나는 경우 오류 발생
print( a[-2]) # 음수 index는 뒤에서 부터 센다, 맨 마지막이 -1
a[3] = False
print(a)
print('abcd'[0]) # 문자열도 배열로 취급한다
print(a[2][1])

a = []
a = list()

a = range(10)
print(a)

