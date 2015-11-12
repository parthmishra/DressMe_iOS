
//
//  Dress_MeUITests.swift
//  Dress MeUITests
//
//  Created by Parth Mishra on 11/12/15.
//  Copyright © 2015 Parth Mishra. All rights reserved.
//

import XCTest

class Dress_MeUITests: XCTestCase {
        
    override func setUp() {
        super.setUp()
        
        // Put setup code here. This method is called before the invocation of each test method in the class.
        
        // In UI tests it is usually best to stop immediately when a failure occurs.
        continueAfterFailure = false
        // UI tests must launch the application that they test. Doing this in setup will make sure it happens for each test method.
        XCUIApplication().launch()

        // In UI tests it’s important to set the initial state - such as interface orientation - required for your tests before they run. The setUp method is a good place to do this.
    }
    
    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }
    
    
    func testNameTapped() {
        let app = XCUIApplication()
        app.buttons["Name:"].tap()
        app.alerts["Name"].collectionViews.buttons["Dismiss"].tap()
        
    }
    
    func testAgeTapped() {
        let app = XCUIApplication()
        app.buttons["Age:"].tap()
        app.alerts["Age"].collectionViews.buttons["Dismiss"].tap()
        
    }
    
    func testLocationTapped() {
        let app = XCUIApplication()
        app.buttons["Location:"].tap()
        app.alerts["Location"].collectionViews.buttons["Dismiss"].tap()
        
    }
    
    func testGetLocation() {
        let app = XCUIApplication()
        app.buttons["Get Location"].tap()
        app.alerts["Dress Me"].collectionViews.buttons["Allow"].buttons["Don't Allow"].tap()
    }
    
    func testAddProfilePic() {
        XCUIApplication().buttons["Upload Profile Picture"].tap()›
        
    }
    
}
