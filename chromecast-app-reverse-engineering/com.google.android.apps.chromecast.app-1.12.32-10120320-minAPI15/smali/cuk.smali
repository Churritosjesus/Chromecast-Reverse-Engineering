.class Lcuk;
.super Ljava/lang/Object;


# static fields
.field private static d:Lcuk;


# instance fields
.field volatile a:Lcul;

.field volatile b:Ljava/lang/String;

.field volatile c:Ljava/lang/String;

.field private volatile e:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1000
    sget-object v0, Lcul;->a:Lcul;

    iput-object v0, p0, Lcuk;->a:Lcul;

    iput-object v1, p0, Lcuk;->c:Ljava/lang/String;

    iput-object v1, p0, Lcuk;->b:Ljava/lang/String;

    iput-object v1, p0, Lcuk;->e:Ljava/lang/String;

    .line 0
    return-void
.end method

.method static a()Lcuk;
    .locals 2

    const-class v1, Lcuk;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcuk;->d:Lcuk;

    if-nez v0, :cond_0

    new-instance v0, Lcuk;

    invoke-direct {v0}, Lcuk;-><init>()V

    sput-object v0, Lcuk;->d:Lcuk;

    :cond_0
    sget-object v0, Lcuk;->d:Lcuk;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
