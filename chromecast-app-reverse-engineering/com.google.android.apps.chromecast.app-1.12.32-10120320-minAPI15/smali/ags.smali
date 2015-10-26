.class public final enum Lags;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lags;

.field public static final enum b:Lags;

.field public static final enum c:Lags;

.field public static final enum d:Lags;

.field public static final enum e:Lags;

.field public static final enum f:Lags;

.field public static final enum g:Lags;

.field public static final enum h:Lags;

.field private static final synthetic i:[Lags;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 32
    new-instance v0, Lags;

    const-string v1, "REQUESTS"

    invoke-direct {v0, v1, v3}, Lags;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lags;->a:Lags;

    .line 37
    new-instance v0, Lags;

    const-string v1, "INCLUDE_ACCESS_TOKENS"

    invoke-direct {v0, v1, v4}, Lags;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lags;->b:Lags;

    .line 41
    new-instance v0, Lags;

    const-string v1, "INCLUDE_RAW_RESPONSES"

    invoke-direct {v0, v1, v5}, Lags;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lags;->c:Lags;

    .line 45
    new-instance v0, Lags;

    const-string v1, "CACHE"

    invoke-direct {v0, v1, v6}, Lags;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lags;->d:Lags;

    .line 49
    new-instance v0, Lags;

    const-string v1, "APP_EVENTS"

    invoke-direct {v0, v1, v7}, Lags;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lags;->e:Lags;

    .line 54
    new-instance v0, Lags;

    const-string v1, "DEVELOPER_ERRORS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lags;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lags;->f:Lags;

    .line 60
    new-instance v0, Lags;

    const-string v1, "GRAPH_API_DEBUG_WARNING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lags;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lags;->g:Lags;

    .line 67
    new-instance v0, Lags;

    const-string v1, "GRAPH_API_DEBUG_INFO"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lags;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lags;->h:Lags;

    .line 28
    const/16 v0, 0x8

    new-array v0, v0, [Lags;

    sget-object v1, Lags;->a:Lags;

    aput-object v1, v0, v3

    sget-object v1, Lags;->b:Lags;

    aput-object v1, v0, v4

    sget-object v1, Lags;->c:Lags;

    aput-object v1, v0, v5

    sget-object v1, Lags;->d:Lags;

    aput-object v1, v0, v6

    sget-object v1, Lags;->e:Lags;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lags;->f:Lags;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lags;->g:Lags;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lags;->h:Lags;

    aput-object v2, v0, v1

    sput-object v0, Lags;->i:[Lags;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lags;
    .locals 1

    .prologue
    .line 28
    const-class v0, Lags;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lags;

    return-object v0
.end method

.method public static values()[Lags;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lags;->i:[Lags;

    invoke-virtual {v0}, [Lags;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lags;

    return-object v0
.end method
