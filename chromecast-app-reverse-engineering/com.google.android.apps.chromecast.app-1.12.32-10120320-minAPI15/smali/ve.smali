.class Lve;
.super Ltq;
.source "PG"


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 47
    new-instance v0, Ltt;

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "android"

    const-class v3, Lve;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ltt;-><init>(Landroid/content/ComponentName;)V

    invoke-direct {p0, p1, v0}, Ltq;-><init>(Landroid/content/Context;Ltt;)V

    .line 49
    return-void
.end method

.method public static a(Landroid/content/Context;Lvo;)Lve;
    .locals 2

    .prologue
    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    .line 53
    new-instance v0, Lvk;

    invoke-direct {v0, p0, p1}, Lvk;-><init>(Landroid/content/Context;Lvo;)V

    .line 61
    :goto_0
    return-object v0

    .line 55
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 56
    new-instance v0, Lvj;

    invoke-direct {v0, p0, p1}, Lvj;-><init>(Landroid/content/Context;Lvo;)V

    goto :goto_0

    .line 58
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 59
    new-instance v0, Lvf;

    invoke-direct {v0, p0, p1}, Lvf;-><init>(Landroid/content/Context;Lvo;)V

    goto :goto_0

    .line 61
    :cond_2
    new-instance v0, Lvl;

    invoke-direct {v0, p0}, Lvl;-><init>(Landroid/content/Context;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Luh;)V
    .locals 0

    .prologue
    .line 69
    return-void
.end method

.method public b(Luh;)V
    .locals 0

    .prologue
    .line 76
    return-void
.end method

.method public c(Luh;)V
    .locals 0

    .prologue
    .line 83
    return-void
.end method

.method public d(Luh;)V
    .locals 0

    .prologue
    .line 90
    return-void
.end method
