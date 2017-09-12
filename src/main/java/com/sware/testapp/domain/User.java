package com.sware.testapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/*
{
"_id": "59b7e941dce58828b00e30e2",
"userName": "SachiN Ware",
"password": "sachin1234"
},
  {
"_id": "59b7e960dce58828b00e30e3",
"userName": "Komal Kadam",
"password": "Komal1234"
},
  {
"_id": "59b81958dce5880354235fcb",
"userName": "Akash Ware",
"password": "Akash1234"
},
  {
"_id": "59b819bcdce5880354235fcc",
"userName": "Shirish Kumar",
"password": "shirish1111"
},
  {
"_id": "59b819c8dce5880354235fcd",
"userName": "Shirish Kumar",
"password": "shirish1111"
},
  {
"_id": "59b819d9dce5881b941e8ca2",
"userName": "Shirish Kumar",
"password": "shirish1111"
},
  {
"_id": "05",
"userName": "Rhhidhi More",
"password": "user5"
},
  {
"_id": "59b81d68dce5881d8019e061",
"userName": "Amol Bhosale",
"password": "user6"
},
  {
"_id": "59b81d94dce5881d8019e062",
"userName": "Santosh Misle",
"password": "user7"
},
  {
"_id": "59b81e2bdce588219cd638f2",
"userName": "Sandip",
"password": "user8"
}
]
*/
public class User {
		@Id
		String _id;
		String userName;
		String password;
		
		public User() {
		}
		
		public User(String userName, String password) {
			this.userName = userName;
			this.password = password;
		}
		
		public User( String _id, String userName, String password) {
			this._id= _id;
			this.userName = userName;
			this.password = password;
		}
		
		public String get_id() {
			return _id;
		}

		public void set_id(String _id) {
			this._id = _id;
		}
		

		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
