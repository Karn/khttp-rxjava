package khttp.extensions

import khttp.responses.Response
import org.junit.Test

class RxKHttpSpec {

    @Test
    fun getRequest() {
        get(url = "http://httpbin.org/get")
                .subscribe { response: Response?, error: Throwable? ->
                    assert(error == null)
                    assert(response?.statusCode == 200)
                }
    }
}