a = 10
naver = 1
nvaer = 2

b = a // 3
print(b)
print(-a // 3)

print(2 ** 10)

a = int(-3.3)
print(a)
print(int('100')+1)
# print(int('10asdf')+1)

# print = 10
# print(a)

a = 10
print(type(a))
a = 'abc'
print(type(a))
print(type(print))

# 정밀도
a = 0.12345678901234567890
print(a)    # 파이썬의 정밀도 : 소수점 14자리까지

a, b, c = 10, 20, 30
print(a,b,c)

a= True
b = False
c = None # null 없고 대신에 None
# 파이썬에서 false로 인식되는 경우 : False,None,0, 0.0, 빈 컨테이너
# True는 False가 아닌것
id = 'id'
# print(html)

html = f'''
<div>
    <strong>{id}</strong>
</div>'''
print(html)

print("쌍따옴표 기호는 \" 입니다")