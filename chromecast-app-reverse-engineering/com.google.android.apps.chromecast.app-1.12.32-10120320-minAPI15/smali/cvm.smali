.class final Lcvm;
.super Ljava/lang/Thread;

# interfaces
.implements Lcvl;


# static fields
.field private static d:Lcvm;


# instance fields
.field private final a:Ljava/util/concurrent/LinkedBlockingQueue;

.field private volatile b:Z

.field private volatile c:Z

.field private volatile e:Lcvo;

.field private final f:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    const-string v0, "GAThread"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcvm;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    iput-boolean v1, p0, Lcvm;->b:Z

    iput-boolean v1, p0, Lcvm;->c:Z

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcvm;->f:Landroid/content/Context;

    :goto_0
    invoke-virtual {p0}, Lcvm;->start()V

    return-void

    :cond_0
    iput-object p1, p0, Lcvm;->f:Landroid/content/Context;

    goto :goto_0
.end method

.method static a(Landroid/content/Context;)Lcvm;
    .locals 1

    sget-object v0, Lcvm;->d:Lcvm;

    if-nez v0, :cond_0

    new-instance v0, Lcvm;

    invoke-direct {v0, p0}, Lcvm;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcvm;->d:Lcvm;

    :cond_0
    sget-object v0, Lcvm;->d:Lcvm;

    return-object v0
.end method

.method static synthetic a(Lcvm;)Lcvo;
    .locals 1

    iget-object v0, p0, Lcvm;->e:Lcvo;

    return-object v0
.end method

.method static synthetic a(Lcvm;Lcvo;)Lcvo;
    .locals 0

    iput-object p1, p0, Lcvm;->e:Lcvo;

    return-object p1
.end method

.method static synthetic b(Lcvm;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcvm;->f:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcvm;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 7

    .prologue
    .line 0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1000
    new-instance v1, Lcvn;

    move-object v2, p0

    move-object v3, p0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcvn;-><init>(Lcvm;Lcvl;JLjava/lang/String;)V

    invoke-virtual {p0, v1}, Lcvm;->a(Ljava/lang/Runnable;)V

    .line 0
    return-void
.end method

.method public final run()V
    .locals 4

    .prologue
    .line 0
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcvm;->c:Z

    :try_start_0
    iget-object v0, p0, Lcvm;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    iget-boolean v1, p0, Lcvm;->b:Z

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error on Google TagManager Thread: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2000
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v3, Ljava/io/PrintStream;

    invoke-direct {v3, v2}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    invoke-virtual {v3}, Ljava/io/PrintStream;->flush()V

    new-instance v0, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V

    .line 0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    const-string v0, "Google TagManager is shutting down."

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcvm;->b:Z

    goto :goto_0
.end method
