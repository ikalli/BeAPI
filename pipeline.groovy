node{
stage('Hello'){
echo "Hello ADEO"
}
stage ('Env variable'){
sh 'echo Affiche toutes les variables environnement disponibles :'
sh 'env'
}
