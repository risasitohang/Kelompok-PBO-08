<?php

use Slim\App;
use Slim\Http\Request;
use Slim\Http\Response;
use Slim\Http\UploadedFile;

return function (App $app) {
    $container = $app->getContainer();
    $app->post('/login', function (Request $request, Response $response, array $args) {
        $input = $request->getParsedBody();
        $Username=trim(strip_tags($input['Username']));
        $Password=trim(strip_tags($input['Password']));
        $sql = "SELECT * FROM users";
        $sth = $this->db->prepare($sql);
        $sth->bindParam("username", $Username);
        $sth->bindParam("password", $Password);
        $sth->execute();
        $user = $sth->fetchAll();       
        if(!$user) {
            return $this->response->withJson(['status' => 'error', 'message' => 'These credentials do not match our records username.']);  
        }
        $settings = $this->get('settings');       
    
  
        return $response->withJson(["status" => "success", "data" => $user], 200);
    });  

};
