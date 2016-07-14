mkdir tests

wget --server-response --output-document=tests/TEST-swagger.xml --header="Content-Type: application/json" --post-data='{"swaggerURL":"http://169.44.118.61:8080/TomcatWebAppForChefNode/swagger.json"}' http://169.44.116.214:9080/SwaggerParser/api/swaggerTestService &> wget.out


MY_EXIT_CODE=$(grep -m1 teststatus wget.out | cut -d':' -f2)
echo My exit code is $MY_EXIT_CODE

echo This is the last line.
exit $MY_EXIT_CODE