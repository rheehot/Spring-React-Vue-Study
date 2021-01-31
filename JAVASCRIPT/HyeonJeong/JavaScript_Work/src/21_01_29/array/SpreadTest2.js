const SpreadTest2 = () => {
    let arrNum = [2, 3, 4]
    // 1이 먼저고 뒤쪽에 arrNum오고 맨 뒤에 5가 온다.
    let newArrNum = [1, ...arrNum, 5]
    // ...은 어떤 특정한 객체에 들어있는 내용을 나열한다.
    
    console.log("SpreadTest2: " + arrNum)
    console.long("SpreadTest2: " + newArrNum)

    return (
        <div className = "SpreadTest2">
            <p>
                Spread Test2
            </p>
        </div>
    )
}

export default SpreadTest2
