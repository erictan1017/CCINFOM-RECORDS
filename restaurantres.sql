-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurantres
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `account_ID` int NOT NULL,
  `membershipTier` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `membershipDiscount` float NOT NULL,
  PRIMARY KEY (`account_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,0,'Jimothy Jim',0),(2,1,'Ericson Tan',0.05),(3,2,'Edward Lim',0.1),(4,3,'Tracy Cruz',0.15),(5,4,'Lilith Stone',0.2);
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dishes`
--

DROP TABLE IF EXISTS `dishes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dishes` (
  `dish_ID` int NOT NULL,
  `dish_name` varchar(45) NOT NULL,
  `dish_price` float NOT NULL,
  `dish_quantity` int NOT NULL,
  PRIMARY KEY (`dish_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dishes`
--

LOCK TABLES `dishes` WRITE;
/*!40000 ALTER TABLE `dishes` DISABLE KEYS */;
INSERT INTO `dishes` VALUES (1,'carrot cake',200,15),(2,'mango shake',150,10),(3,'osso buco',850,4),(4,'mashed potato',200,5),(5,'french onion soup',350,9),(6,'minestrone',300,9),(7,'tomato straws',150,15);
/*!40000 ALTER TABLE `dishes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingredient_list`
--

DROP TABLE IF EXISTS `ingredient_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingredient_list` (
  `il_dishID` int NOT NULL,
  `il_rmID` int NOT NULL,
  `il_quantity` int NOT NULL,
  PRIMARY KEY (`il_dishID`,`il_rmID`),
  KEY `recipe_rmID_idx` (`il_rmID`),
  CONSTRAINT `recipe_dishID` FOREIGN KEY (`il_dishID`) REFERENCES `dishes` (`dish_ID`),
  CONSTRAINT `recipe_rmID` FOREIGN KEY (`il_rmID`) REFERENCES `rawmaterial` (`rm_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingredient_list`
--

LOCK TABLES `ingredient_list` WRITE;
/*!40000 ALTER TABLE `ingredient_list` DISABLE KEYS */;
INSERT INTO `ingredient_list` VALUES (1,4,5),(2,5,2),(3,2,2),(3,3,2),(3,4,2),(4,1,4),(5,3,3),(6,2,4),(6,3,3),(6,4,2),(7,2,10);
/*!40000 ALTER TABLE `ingredient_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rawmaterial`
--

DROP TABLE IF EXISTS `rawmaterial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rawmaterial` (
  `rm_ID` int NOT NULL,
  `rm_vendorID` int NOT NULL,
  `rm_name` varchar(45) NOT NULL,
  `rm_price` float NOT NULL,
  `rm_quantity` int NOT NULL,
  PRIMARY KEY (`rm_ID`),
  KEY `rm_vendorID_idx` (`rm_vendorID`),
  CONSTRAINT `rm_vendorID` FOREIGN KEY (`rm_vendorID`) REFERENCES `supplier` (`supplier_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rawmaterial`
--

LOCK TABLES `rawmaterial` WRITE;
/*!40000 ALTER TABLE `rawmaterial` DISABLE KEYS */;
INSERT INTO `rawmaterial` VALUES (1,1,'potato',50,20),(2,3,'tomato',45,56),(3,2,'onion',55,32),(4,3,'carrot',40,23),(5,1,'mango',35,11);
/*!40000 ALTER TABLE `rawmaterial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffs`
--

DROP TABLE IF EXISTS `staffs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staffs` (
  `staff_ID` int NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` int NOT NULL,
  `working_Day` VARCHAR(10) NOT NULL,
  `salary` float NOT NULL,
  PRIMARY KEY (`staff_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffs`
--

LOCK TABLES `staffs` WRITE;
/*!40000 ALTER TABLE `staffs` DISABLE KEYS */;
INSERT INTO `staffs` VALUES (1,'John Doe',28,'Monday',3000),(2,'Jane Doe',34,'Tuesday',3200),(3,'Luis Roa',26,'Wednesday',2800),(4,'Alice Johnson',30,'Thursday',3100),(5,'Chris Lee',40,'Friday',3500);
/*!40000 ALTER TABLE `staffs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `supplier_ID` int NOT NULL,
  `supplier_name` varchar(45) NOT NULL,
  PRIMARY KEY (`supplier_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'Carti '),(2,'Alibaba'),(3,'Pepsico');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

--
-- Table structure for table `PurchaseOrder`
--

DROP TABLE IF EXISTS `PurchaseOrder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PurchaseOrder` (
  `PO_ID` int NOT NULL,
  `supplier_ID` int NOT NULL,
  `purchaseDate` date NOT NULL,
  `grandTotal` float NOT NULL,
  PRIMARY KEY (`PO_ID`),
  KEY `supplier_ID_idx` (`supplier_ID`),
  CONSTRAINT `fk_supplier` FOREIGN KEY (`supplier_ID`) REFERENCES `supplier` (`supplier_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PurchaseOrder`
--

LOCK TABLES `PurchaseOrder` WRITE;
/*!40000 ALTER TABLE `PurchaseOrder` DISABLE KEYS */;
INSERT INTO `PurchaseOrder` VALUES (1, 1, '2024-11-01', 4500.00), (2, 2, '2024-11-05', 6200.00), (3, 3, '2024-11-10', 3800.00), (4, 1, '2024-11-15', 2000.00);
/*!40000 ALTER TABLE `PurchaseOrder` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

--
-- Table structure for table `PODetails`
--

DROP TABLE IF EXISTS `PODetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PODetails` (
  `PO_ID` int NOT NULL,
  `rm_ID` int NOT NULL,
  `quantity` int NOT NULL,
  `subtotalPrice` float NOT NULL,
  PRIMARY KEY (`PO_ID`, `rm_ID`),
  KEY `rm_ID_idx` (`rm_ID`),
  CONSTRAINT `fk_PO` FOREIGN KEY (`PO_ID`) REFERENCES `PurchaseOrder` (`PO_ID`),
  CONSTRAINT `fk_rm` FOREIGN KEY (`rm_ID`) REFERENCES `rawmaterial` (`rm_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PODetails`
--

LOCK TABLES `PODetails` WRITE;
/*!40000 ALTER TABLE `PODetails` DISABLE KEYS */;
INSERT INTO `PODetails` VALUES (1, 1, 20, 1000.00), (1, 4, 25, 1000.00), (2, 2, 50, 2250.00), (2, 3, 40, 2200.00), (3, 5, 30, 1050.00), (4, 4, 20, 800.00);  
/*!40000 ALTER TABLE `PODetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

-- Table structure for table `reservations`
--
DROP TABLE IF EXISTS `reservations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservations` (
	`reservation_ID` int NOT NULL,
	`account_ID` int NOT NULL,
	`date` date NOT NULL,
	`seatCount` int NOT NULL,
	`staff_ID` int NOT NULL,
	PRIMARY KEY (`reservation_ID`),
	FOREIGN KEY (`account_ID`) REFERENCES customers(account_ID),
	FOREIGN KEY (`staff_ID`) REFERENCES staffs(staff_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--
LOCK TABLES `reservations` WRITE;
/*!40000 ALTER TABLE `reservations` DISABLE KEYS */;
INSERT INTO `reservations` VALUES (1, 2, '2024-11-25', 1, 3), (2, 1, '2024-12-01', 1, 1), (3, 3, '2024-12-08', 1, 2), (4, 5, '2024-12-08', 1, 4), (5, 4, '2024-12-23', 2, 1);
/*!40000 ALTER TABLE `reservations` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;


-- Table structure for table `OrderTable`
--
DROP TABLE IF EXISTS `OrderTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `OrderTable` (
	`order_ID` int NOT NULL,
	`reservation_ID` int NOT NULL,
	`grandTotal` float NOT NULL,
	`payment` float NOT NULL,
	PRIMARY KEY (`order_ID`),
	FOREIGN KEY (`reservation_ID`) REFERENCES reservations(reservation_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OrderTable`
--
LOCK TABLES `OrderTable` WRITE;
/*!40000 ALTER TABLE `OrderTable` DISABLE KEYS */;
INSERT INTO `OrderTable` VALUES (1, 1, 500, 'Cash'), (2, 2, 300, 'Card'), (3, 3, 1000, 'Cash'), (4, 4, 200, 'Card'), (5, 5, 1400, 'Cash');
/*!40000 ALTER TABLE `OrderTable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;


-- Table structure for table `OrderDetail`
--
DROP TABLE IF EXISTS `OrderDetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `OrderDetail` (
	`order_ID` int NOT NULL,
	`dish_ordered` int NOT NULL,
	`quantity` int NOT NULL,
	`subtotalPrice` float NOT NULL,
	FOREIGN KEY (`order_ID`) REFERENCES OrderTable(order_ID),
	FOREIGN KEY (`dish_ordered`) REFERENCES dishes(dish_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OrderTable`
--
LOCK TABLES `OrderDetail` WRITE;
/*!40000 ALTER TABLE `OrderDetail` DISABLE KEYS */;
INSERT INTO `OrderDetail` VALUES (1, 2, 1, 150), (1, 5, 1, 350), (2, 6, 1, 300), (3, 3, 1, 850), (3, 7, 1, 150), (4, 1, 1, 200), (5, 1, 2, 400), (5, 6, 2, 600), (5, 4, 2 ,400);
/*!40000 ALTER TABLE `OrderDetail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-16  6:44:05
