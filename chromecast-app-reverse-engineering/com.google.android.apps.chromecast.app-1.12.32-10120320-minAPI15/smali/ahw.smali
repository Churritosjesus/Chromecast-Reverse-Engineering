.class public final enum Lahw;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lahw;

.field public static final enum b:Lahw;

.field private static final synthetic c:[Lahw;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 41
    new-instance v0, Lahw;

    const-string v1, "MOBILE_INSTALL_EVENT"

    invoke-direct {v0, v1, v2}, Lahw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahw;->a:Lahw;

    .line 42
    new-instance v0, Lahw;

    const-string v1, "CUSTOM_APP_EVENTS"

    invoke-direct {v0, v1, v3}, Lahw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahw;->b:Lahw;

    .line 40
    const/4 v0, 0x2

    new-array v0, v0, [Lahw;

    sget-object v1, Lahw;->a:Lahw;

    aput-object v1, v0, v2

    sget-object v1, Lahw;->b:Lahw;

    aput-object v1, v0, v3

    sput-object v0, Lahw;->c:[Lahw;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lahw;
    .locals 1

    .prologue
    .line 40
    const-class v0, Lahw;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lahw;

    return-object v0
.end method

.method public static values()[Lahw;
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lahw;->c:[Lahw;

    invoke-virtual {v0}, [Lahw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lahw;

    return-object v0
.end method
