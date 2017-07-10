
class GroovyDemo {
	


	static main(args) {


		//循环相关

		for(i in 0..2) { println 'Hello world ' }

		0.upto(2) { println "$it " }

		3.times { println "$it " }

		0.step(10, 2) { println "$it " }

		3.times { println 'ho ' }

		//执行命令，脚本等
		println "cmd /C dir".execute().text



//		println foo('evil' )
		println foo(null)
	}

	def foo(str)
	{
		str?.reverse()
	}

}
