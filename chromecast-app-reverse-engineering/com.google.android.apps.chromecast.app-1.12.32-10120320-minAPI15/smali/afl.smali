.class public final enum Lafl;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lafl;

.field public static final enum b:Lafl;

.field public static final enum c:Lafl;

.field private static enum e:Lafl;

.field private static enum f:Lafl;

.field private static enum g:Lafl;

.field private static enum h:Lafl;

.field private static final synthetic i:[Lafl;


# instance fields
.field final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 30
    new-instance v0, Lafl;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v4, v4}, Lafl;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lafl;->e:Lafl;

    .line 35
    new-instance v0, Lafl;

    const-string v1, "FACEBOOK_APPLICATION_WEB"

    invoke-direct {v0, v1, v3, v3}, Lafl;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lafl;->a:Lafl;

    .line 40
    new-instance v0, Lafl;

    const-string v1, "FACEBOOK_APPLICATION_NATIVE"

    invoke-direct {v0, v1, v5, v3}, Lafl;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lafl;->f:Lafl;

    .line 46
    new-instance v0, Lafl;

    const-string v1, "FACEBOOK_APPLICATION_SERVICE"

    invoke-direct {v0, v1, v6, v3}, Lafl;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lafl;->b:Lafl;

    .line 51
    new-instance v0, Lafl;

    const-string v1, "WEB_VIEW"

    invoke-direct {v0, v1, v7, v4}, Lafl;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lafl;->c:Lafl;

    .line 56
    new-instance v0, Lafl;

    const-string v1, "TEST_USER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v3}, Lafl;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lafl;->g:Lafl;

    .line 60
    new-instance v0, Lafl;

    const-string v1, "CLIENT_TOKEN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v3}, Lafl;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lafl;->h:Lafl;

    .line 26
    const/4 v0, 0x7

    new-array v0, v0, [Lafl;

    sget-object v1, Lafl;->e:Lafl;

    aput-object v1, v0, v4

    sget-object v1, Lafl;->a:Lafl;

    aput-object v1, v0, v3

    sget-object v1, Lafl;->f:Lafl;

    aput-object v1, v0, v5

    sget-object v1, Lafl;->b:Lafl;

    aput-object v1, v0, v6

    sget-object v1, Lafl;->c:Lafl;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lafl;->g:Lafl;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lafl;->h:Lafl;

    aput-object v2, v0, v1

    sput-object v0, Lafl;->i:[Lafl;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 65
    iput-boolean p3, p0, Lafl;->d:Z

    .line 66
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lafl;
    .locals 1

    .prologue
    .line 26
    const-class v0, Lafl;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lafl;

    return-object v0
.end method

.method public static values()[Lafl;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lafl;->i:[Lafl;

    invoke-virtual {v0}, [Lafl;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lafl;

    return-object v0
.end method
