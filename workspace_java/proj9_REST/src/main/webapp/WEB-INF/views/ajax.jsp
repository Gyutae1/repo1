<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>

// 	window.onload = function(){} 한개의 페이지에만 사용할수있다
	window.addEventListener("load",function(){
		const btn = document.querySelector("#btn")
		btn.addEventListener("click",function(){
			
			console.log("click!!")
			
			const xhr = new XMLHttpRequest();
			const url = "human/test1";
			
			const data = {
					"ename" : "박규태",
					sal : 3200
			}
			xhr.open("post",url);
			xhr.setRequestHeader("Content-Type","application/json");
			
			const strData = JSON.stringify(data);
			console.log(data)			// 객체 그자체
										// 네트워크는 객체를 전달할 수 없다
			console.log(''+data)		
			console.log(strData)		// 그래서 string으로 변형
			console.log(data, strData);
			
			xhr.send(strData);
			
			xhr.onload = function(){
				console.log( xhr.responseText )
				try{
					let result = JSON.parse(xhr.responseText)
					console.log(result)
					
					console.log(result.ename)
					console.log(result["ename"])
				}catch(e){
					console.log("JSON아님")
				}
			}
			
		})
	})

</script>

</head>
<body>

	<button id="btn">ajax 실행</button>
</body>
</html>