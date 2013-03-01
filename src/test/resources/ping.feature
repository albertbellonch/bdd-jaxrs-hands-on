Feature: Ping the server

Scenario: Ping the server
    When I GET /ping
    Then I receive a JSON message
    """
    {"message":"pong"}
    """
