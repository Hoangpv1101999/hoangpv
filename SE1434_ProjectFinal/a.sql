USE [master]
GO
/****** Object:  Database [SE1434_ProjectFinalPRJ321]    Script Date: 26/06/2021 4:04:54 PM ******/
CREATE DATABASE [SE1434_ProjectFinalPRJ321]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SE1434_ProjectFinalPRJ321', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\SE1434_ProjectFinalPRJ321.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'SE1434_ProjectFinalPRJ321_log', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\SE1434_ProjectFinalPRJ321_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SE1434_ProjectFinalPRJ321].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET ARITHABORT OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET  DISABLE_BROKER 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET  MULTI_USER 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET DELAYED_DURABILITY = DISABLED 
GO
USE [SE1434_ProjectFinalPRJ321]
GO
/****** Object:  User [SE1434]    Script Date: 26/06/2021 4:04:54 PM ******/
CREATE USER [SE1434] FOR LOGIN [SE1434] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[Accid] [int] NOT NULL,
	[Username] [nvarchar](max) NOT NULL,
	[Password] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[Accid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Export_Detail]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Export_Detail](
	[stt] [int] IDENTITY(1,1) NOT NULL,
	[TypeError] [nvarchar](max) NULL,
	[Allow] [nvarchar](max) NULL,
	[notAllow] [nvarchar](max) NULL,
	[amount] [int] NULL,
	[rate] [float] NULL,
	[note] [nvarchar](max) NULL,
	[proid] [int] NULL,
 CONSTRAINT [PK_Export_Detail] PRIMARY KEY CLUSTERED 
(
	[stt] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Export_invoice]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Export_invoice](
	[stt] [int] NOT NULL,
	[proid] [int] NOT NULL,
	[lowquality] [int] NOT NULL,
	[qualified] [int] NOT NULL,
	[date] [date] NOT NULL,
	[note] [nvarchar](max) NOT NULL,
	[orderid] [int] NULL,
	[total] [int] NULL,
	[rateall] [float] NULL,
	[proFinish] [int] NULL,
	[rateLow] [float] NULL,
	[ratequalified] [float] NULL,
 CONSTRAINT [PK_Export_invoice] PRIMARY KEY CLUSTERED 
(
	[stt] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Feature]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Feature](
	[fid] [int] NOT NULL,
	[fname] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Feature] PRIMARY KEY CLUSTERED 
(
	[fid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Group]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Group](
	[gid] [int] NOT NULL,
	[gname] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Group] PRIMARY KEY CLUSTERED 
(
	[gid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Group_Account]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Group_Account](
	[gid] [int] NOT NULL,
	[accid] [int] NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Group_Feature]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Group_Feature](
	[gid] [int] NOT NULL,
	[fid] [int] NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Import_invoice]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Import_invoice](
	[OrderId] [int] NOT NULL,
	[Payment] [float] NOT NULL,
	[Date] [date] NOT NULL,
	[gid] [int] NOT NULL,
 CONSTRAINT [PK_Import_invoice] PRIMARY KEY CLUSTERED 
(
	[OrderId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Import_invoice_Detail]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Import_invoice_Detail](
	[orderID] [int] NOT NULL,
	[orderName] [nvarchar](max) NOT NULL,
	[Amount] [int] NOT NULL,
	[Note] [nvarchar](max) NOT NULL,
	[KHSX] [nvarchar](max) NULL,
	[DVT] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ProductPayment]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ProductPayment](
	[productid] [int] NOT NULL,
	[productPayment] [float] NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[productss]    Script Date: 26/06/2021 4:04:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[productss](
	[proid] [int] NOT NULL,
	[proName] [nvarchar](max) NOT NULL,
	[AmountOfBunch] [int] NOT NULL,
	[AmountProductInPunch] [int] NOT NULL,
	[img] [nvarchar](max) NOT NULL,
	[producer] [nvarchar](max) NOT NULL,
	[supplier] [nvarchar](max) NOT NULL,
	[orderid] [nvarchar](max) NOT NULL,
	[total] [int] NULL,
 CONSTRAINT [PK_productss] PRIMARY KEY CLUSTERED 
(
	[proid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
ALTER TABLE [dbo].[Export_Detail]  WITH CHECK ADD  CONSTRAINT [FK_Export_Detail_Export_invoice] FOREIGN KEY([proid])
REFERENCES [dbo].[Export_invoice] ([stt])
GO
ALTER TABLE [dbo].[Export_Detail] CHECK CONSTRAINT [FK_Export_Detail_Export_invoice]
GO
ALTER TABLE [dbo].[Export_invoice]  WITH CHECK ADD  CONSTRAINT [FK_Export_invoice_productss] FOREIGN KEY([proid])
REFERENCES [dbo].[productss] ([proid])
GO
ALTER TABLE [dbo].[Export_invoice] CHECK CONSTRAINT [FK_Export_invoice_productss]
GO
ALTER TABLE [dbo].[Group_Account]  WITH CHECK ADD  CONSTRAINT [FK_Group_Account_Account] FOREIGN KEY([accid])
REFERENCES [dbo].[Account] ([Accid])
GO
ALTER TABLE [dbo].[Group_Account] CHECK CONSTRAINT [FK_Group_Account_Account]
GO
ALTER TABLE [dbo].[Group_Account]  WITH CHECK ADD  CONSTRAINT [FK_Group_Account_Group] FOREIGN KEY([gid])
REFERENCES [dbo].[Group] ([gid])
GO
ALTER TABLE [dbo].[Group_Account] CHECK CONSTRAINT [FK_Group_Account_Group]
GO
ALTER TABLE [dbo].[Group_Feature]  WITH CHECK ADD  CONSTRAINT [FK_Group_Feature_Feature] FOREIGN KEY([fid])
REFERENCES [dbo].[Feature] ([fid])
GO
ALTER TABLE [dbo].[Group_Feature] CHECK CONSTRAINT [FK_Group_Feature_Feature]
GO
ALTER TABLE [dbo].[Group_Feature]  WITH CHECK ADD  CONSTRAINT [FK_Group_Feature_Group] FOREIGN KEY([gid])
REFERENCES [dbo].[Group] ([gid])
GO
ALTER TABLE [dbo].[Group_Feature] CHECK CONSTRAINT [FK_Group_Feature_Group]
GO
ALTER TABLE [dbo].[Import_invoice_Detail]  WITH CHECK ADD  CONSTRAINT [FK_Import_invoice_Detail_Import_invoice] FOREIGN KEY([orderID])
REFERENCES [dbo].[Import_invoice] ([OrderId])
GO
ALTER TABLE [dbo].[Import_invoice_Detail] CHECK CONSTRAINT [FK_Import_invoice_Detail_Import_invoice]
GO
USE [master]
GO
ALTER DATABASE [SE1434_ProjectFinalPRJ321] SET  READ_WRITE 
GO
