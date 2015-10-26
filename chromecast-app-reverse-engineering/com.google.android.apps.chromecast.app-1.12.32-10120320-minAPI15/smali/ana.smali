.class public final enum Lana;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lana;

.field public static final enum b:Lana;

.field public static final enum c:Lana;

.field private static final synthetic f:[Lana;


# instance fields
.field public d:I

.field public e:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 91
    new-instance v0, Lana;

    const-string v1, "BROWSE"

    sget v2, Lb;->dY:I

    const-class v3, Lawn;

    invoke-direct {v0, v1, v4, v2, v3}, Lana;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lana;->a:Lana;

    .line 92
    new-instance v0, Lana;

    const-string v1, "DEVICES"

    sget v2, Lb;->bM:I

    const-class v3, Lama;

    invoke-direct {v0, v1, v5, v2, v3}, Lana;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lana;->b:Lana;

    .line 93
    new-instance v0, Lana;

    const-string v1, "GET_APPS"

    sget v2, Lb;->bz:I

    const-class v3, Lbaz;

    invoke-direct {v0, v1, v6, v2, v3}, Lana;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lana;->c:Lana;

    .line 90
    const/4 v0, 0x3

    new-array v0, v0, [Lana;

    sget-object v1, Lana;->a:Lana;

    aput-object v1, v0, v4

    sget-object v1, Lana;->b:Lana;

    aput-object v1, v0, v5

    sget-object v1, Lana;->c:Lana;

    aput-object v1, v0, v6

    sput-object v0, Lana;->f:[Lana;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Class;)V
    .locals 0

    .prologue
    .line 98
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 99
    iput p3, p0, Lana;->d:I

    .line 100
    iput-object p4, p0, Lana;->e:Ljava/lang/Class;

    .line 101
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lana;
    .locals 1

    .prologue
    .line 90
    const-class v0, Lana;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lana;

    return-object v0
.end method

.method public static values()[Lana;
    .locals 1

    .prologue
    .line 90
    sget-object v0, Lana;->f:[Lana;

    invoke-virtual {v0}, [Lana;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lana;

    return-object v0
.end method
