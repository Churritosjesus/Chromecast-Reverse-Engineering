.class final Lcud;
.super Ljava/lang/Object;

# interfaces
.implements Lcuf;


# static fields
.field private static a:Lcud;

.field private static final b:Ljava/lang/Object;


# instance fields
.field private c:Lcwq;

.field private d:Lcvl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcud;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lcvm;->a(Landroid/content/Context;)Lcvm;

    move-result-object v0

    new-instance v1, Lcxs;

    invoke-direct {v1}, Lcxs;-><init>()V

    invoke-direct {p0, v0, v1}, Lcud;-><init>(Lcvl;Lcwq;)V

    return-void
.end method

.method private constructor <init>(Lcvl;Lcwq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcud;->d:Lcvl;

    iput-object p2, p0, Lcud;->c:Lcwq;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcuf;
    .locals 2

    sget-object v1, Lcud;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcud;->a:Lcud;

    if-nez v0, :cond_0

    new-instance v0, Lcud;

    invoke-direct {v0, p0}, Lcud;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcud;->a:Lcud;

    :cond_0
    sget-object v0, Lcud;->a:Lcud;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcud;->c:Lcwq;

    invoke-interface {v0}, Lcwq;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Too many urls sent too quickly with the TagManagerSender, rate limiting invoked."

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcud;->d:Lcvl;

    invoke-interface {v0, p1}, Lcvl;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    goto :goto_0
.end method
