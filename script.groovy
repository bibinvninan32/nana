def buildApp() {
 	echo "building App ..."
}
def testApp() {
 	echo "testing App ..."
}
def deployApp() {
 	echo "deploying App ..."
 	echo "deploying version ${params.VERSION}"
}

return this
