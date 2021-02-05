function * getName(){
    console.log("Generator")
    yield "David"

    console.log("Generator")
    yield "Tom"

    console.log("Generator")
    yield "Kevin"

    console.log("Generator End")
}

function * getMajor(){
    console.log("Generator Major")
    const major = yield "Which subject do you like?"

    console.log("Generator Major")
    const name = yield "What's your name ? "

    return '${name} ${major}'
}

const GeneratorTest = () =>{
    let nameIter = getName()

    console.log(nameIter.next())
    console.log(nameIter.next())
    console.log(nameIter.next())
    console.log(nameIter.next())

    let majorIter = getMajor()

    console.log(majorIter.next())
    console.log(majorIter.next("radar Signal Processing"))
    console.log(majorIter.next("John"))

    return(
        <div className = "GeneratorTest">
            <p>GeneratorTest</p>
        </div>
    )
}

export default GeneratorTest