

	static void pipeline(final closure) {
		final PipelineDsl dsl = new PlpelineDsl() {
          closure.delegate = dsl
          closure.resolveStrategy = DELEGATE_ONLY
          closure.call()
		}
	}

	void agent() {
      println("Running pipeline!!")

	}

	void environment(final Closure closure)

	void stage(final Closure closure) {

	}
