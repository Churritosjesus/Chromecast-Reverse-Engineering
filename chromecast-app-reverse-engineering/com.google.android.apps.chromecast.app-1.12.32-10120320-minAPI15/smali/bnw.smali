.class public final enum Lbnw;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lbnw;

.field public static final enum b:Lbnw;

.field public static final enum c:Lbnw;

.field public static final enum d:Lbnw;

.field public static final enum e:Lbnw;

.field private static final synthetic g:[Lbnw;


# instance fields
.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 76
    new-instance v0, Lbnw;

    const-string v1, "ACTIVE_AUDIO"

    sget v2, La;->ei:I

    invoke-direct {v0, v1, v3, v2}, Lbnw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbnw;->a:Lbnw;

    .line 77
    new-instance v0, Lbnw;

    const-string v1, "IDLE_AUDIO"

    sget v2, La;->eV:I

    invoke-direct {v0, v1, v4, v2}, Lbnw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbnw;->b:Lbnw;

    .line 78
    new-instance v0, Lbnw;

    const-string v1, "ACTIVE"

    sget v2, La;->ej:I

    invoke-direct {v0, v1, v5, v2}, Lbnw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbnw;->c:Lbnw;

    .line 79
    new-instance v0, Lbnw;

    const-string v1, "IDLE"

    sget v2, La;->eW:I

    invoke-direct {v0, v1, v6, v2}, Lbnw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbnw;->d:Lbnw;

    .line 80
    new-instance v0, Lbnw;

    const-string v1, "MIRRORING"

    sget v2, La;->ex:I

    invoke-direct {v0, v1, v7, v2}, Lbnw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbnw;->e:Lbnw;

    .line 75
    const/4 v0, 0x5

    new-array v0, v0, [Lbnw;

    sget-object v1, Lbnw;->a:Lbnw;

    aput-object v1, v0, v3

    sget-object v1, Lbnw;->b:Lbnw;

    aput-object v1, v0, v4

    sget-object v1, Lbnw;->c:Lbnw;

    aput-object v1, v0, v5

    sget-object v1, Lbnw;->d:Lbnw;

    aput-object v1, v0, v6

    sget-object v1, Lbnw;->e:Lbnw;

    aput-object v1, v0, v7

    sput-object v0, Lbnw;->g:[Lbnw;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 85
    iput p3, p0, Lbnw;->f:I

    .line 86
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbnw;
    .locals 1

    .prologue
    .line 75
    const-class v0, Lbnw;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lbnw;

    return-object v0
.end method

.method public static values()[Lbnw;
    .locals 1

    .prologue
    .line 75
    sget-object v0, Lbnw;->g:[Lbnw;

    invoke-virtual {v0}, [Lbnw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbnw;

    return-object v0
.end method
