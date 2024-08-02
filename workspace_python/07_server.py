from flask import Flask, request
# flask 초기화
app = Flask(__name__)


'''
function home(){
    return 'hello wed'
}
'''
@app.route("/home")
def home() :
    a = 10
    print(a)
    return '<h1>hello web</h1>'

@app.route("/join", methods=['GET','POST'])
def login() :
    # 넘겨받은 파라메터 출력
    # get 방식
    id = request.args.get("id")
    

app.run(port=5000, debug=True)