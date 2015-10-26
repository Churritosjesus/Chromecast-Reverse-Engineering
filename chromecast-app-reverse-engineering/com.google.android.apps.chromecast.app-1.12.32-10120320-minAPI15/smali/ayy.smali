.class public final Layy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Layw;


# static fields
.field private static final a:[Ljava/lang/String;


# instance fields
.field private b:Layw;

.field private final c:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 17
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "Chromecast"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "Chromecast Audio"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Chromekey"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "Eureka Dongle"

    aput-object v2, v0, v1

    sput-object v0, Layy;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Layw;)V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lblp;

    const-string v1, "SetupDeviceFilteringListener"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Layy;->c:Lblp;

    .line 31
    iput-object p1, p0, Layy;->b:Layw;

    .line 32
    return-void
.end method

.method public static a(Lcom/google/android/gms/cast/CastDevice;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 77
    sget-object v2, Layy;->a:[Ljava/lang/String;

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 3000
    iget-object v5, p0, Lcom/google/android/gms/cast/CastDevice;->f:Ljava/lang/String;

    .line 78
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 79
    const/4 v0, 0x1

    .line 82
    :cond_0
    return v0

    .line 77
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private static c(Laym;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 57
    .line 1114
    iget-object v1, p0, Laym;->e:Landroid/net/Uri;

    .line 57
    if-nez v1, :cond_1

    .line 68
    :cond_0
    :goto_0
    return v0

    .line 62
    :cond_1
    sget-object v2, Layy;->a:[Ljava/lang/String;

    array-length v3, v2

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 2102
    iget-object v5, p0, Laym;->d:Ljava/lang/String;

    .line 63
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 64
    const/4 v0, 0x1

    goto :goto_0

    .line 62
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Layy;->b:Layw;

    invoke-interface {v0, p1}, Layw;->a(I)V

    .line 37
    return-void
.end method

.method public final a(Laym;)V
    .locals 3

    .prologue
    .line 41
    invoke-static {p1}, Layy;->c(Laym;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Layy;->b:Layw;

    invoke-interface {v0, p1}, Layw;->a(Laym;)V

    .line 46
    :goto_0
    return-void

    .line 44
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 1102
    iget-object v2, p1, Laym;->d:Ljava/lang/String;

    .line 44
    aput-object v2, v0, v1

    goto :goto_0
.end method

.method public final b(Laym;)V
    .locals 1

    .prologue
    .line 50
    invoke-static {p1}, Layy;->c(Laym;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Layy;->b:Layw;

    invoke-interface {v0, p1}, Layw;->b(Laym;)V

    .line 53
    :cond_0
    return-void
.end method
