.class public Lbrb;
.super Ljava/lang/Object;


# static fields
.field private static i:Lbrb;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Landroid/content/Context;

.field public final c:Lcac;

.field final d:Lbrz;

.field final e:Lbql;

.field final f:Lbse;

.field final g:Lbqp;

.field public final h:Lbsd;

.field private final j:Lcox;

.field private final k:Lbqu;

.field private final l:Lbqt;

.field private final m:Lbpo;

.field private final n:Lbrt;

.field private final o:Lbqf;

.field private final p:Lbrm;


# direct methods
.method private constructor <init>(Lbrd;)V
    .locals 7

    .prologue
    const/16 v4, 0x1c9f

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1000
    iget-object v0, p1, Lbrd;->a:Landroid/content/Context;

    .line 0
    const-string v1, "Application context can\'t be null"

    invoke-static {v0, v1}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Application;

    const-string v2, "getApplicationContext didn\'t return the application"

    invoke-static {v1, v2}, La;->b(ZLjava/lang/Object;)V

    .line 2000
    iget-object v1, p1, Lbrd;->b:Landroid/content/Context;

    .line 0
    invoke-static {v1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lbrb;->a:Landroid/content/Context;

    iput-object v1, p0, Lbrb;->b:Landroid/content/Context;

    .line 3000
    invoke-static {}, Lcad;->c()Lcac;

    move-result-object v1

    .line 0
    iput-object v1, p0, Lbrb;->c:Lcac;

    invoke-static {p0}, Lbrd;->b(Lbrb;)Lbrz;

    move-result-object v1

    iput-object v1, p0, Lbrb;->d:Lbrz;

    .line 4000
    new-instance v1, Lbql;

    invoke-direct {v1, p0}, Lbql;-><init>(Lbrb;)V

    .line 0
    invoke-virtual {v1}, Lbql;->s()V

    iput-object v1, p0, Lbrb;->e:Lbql;

    .line 5000
    sget-boolean v1, Lbyk;->a:Z

    .line 0
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lbrb;->a()Lbql;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Google Analytics 4.5.0/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is starting up."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbql;->d(Ljava/lang/String;)V

    :goto_0
    invoke-static {p0}, Lbrd;->f(Lbrb;)Lbqp;

    move-result-object v1

    invoke-virtual {v1}, Lbqp;->s()V

    iput-object v1, p0, Lbrb;->g:Lbqp;

    .line 6000
    new-instance v1, Lbqt;

    invoke-direct {v1, p0}, Lbqt;-><init>(Lbrb;)V

    .line 0
    invoke-virtual {v1}, Lbqt;->s()V

    iput-object v1, p0, Lbrb;->l:Lbqt;

    .line 7000
    new-instance v1, Lbqu;

    invoke-direct {v1, p0, p1}, Lbqu;-><init>(Lbrb;Lbrd;)V

    .line 0
    invoke-static {p0}, Lbrd;->a(Lbrb;)Lbrt;

    move-result-object v2

    .line 8000
    new-instance v3, Lbqf;

    invoke-direct {v3, p0}, Lbqf;-><init>(Lbrb;)V

    .line 9000
    new-instance v4, Lbrm;

    invoke-direct {v4, p0}, Lbrm;-><init>(Lbrb;)V

    .line 10000
    new-instance v5, Lbsd;

    invoke-direct {v5, p0}, Lbsd;-><init>(Lbrb;)V

    .line 11000
    invoke-static {v0}, Lcox;->a(Landroid/content/Context;)Lcox;

    move-result-object v0

    .line 12000
    new-instance v6, Lbrc;

    invoke-direct {v6, p0}, Lbrc;-><init>(Lbrb;)V

    .line 13000
    iput-object v6, v0, Lcox;->c:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 0
    iput-object v0, p0, Lbrb;->j:Lcox;

    .line 14000
    new-instance v0, Lbpo;

    invoke-direct {v0, p0}, Lbpo;-><init>(Lbrb;)V

    .line 0
    invoke-virtual {v2}, Lbrt;->s()V

    iput-object v2, p0, Lbrb;->n:Lbrt;

    invoke-virtual {v3}, Lbqf;->s()V

    iput-object v3, p0, Lbrb;->o:Lbqf;

    invoke-virtual {v4}, Lbrm;->s()V

    iput-object v4, p0, Lbrb;->p:Lbrm;

    invoke-virtual {v5}, Lbsd;->s()V

    iput-object v5, p0, Lbrb;->h:Lbsd;

    invoke-static {p0}, Lbrd;->e(Lbrb;)Lbse;

    move-result-object v2

    invoke-virtual {v2}, Lbse;->s()V

    iput-object v2, p0, Lbrb;->f:Lbse;

    invoke-virtual {v1}, Lbqu;->s()V

    iput-object v1, p0, Lbrb;->k:Lbqu;

    .line 15000
    sget-boolean v2, Lbyk;->a:Z

    .line 0
    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lbrb;->a()Lbql;

    move-result-object v2

    const-string v3, "Device AnalyticsService version"

    invoke-virtual {p0}, Lbrb;->c()Lbqu;

    move-result-object v4

    .line 16000
    iget-object v4, v4, Lbqu;->b:Ljava/lang/String;

    .line 0
    invoke-virtual {v2, v3, v4}, Lbql;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20000
    :cond_0
    iget-object v2, v0, Lbpd;->a:Lbrb;

    .line 19000
    invoke-virtual {v2}, Lbrb;->e()Lbqt;

    move-result-object v2

    .line 18000
    invoke-virtual {v2}, Lbqt;->d()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 21000
    invoke-static {}, Lbqk;->a()Lbpr;

    move-result-object v3

    .line 18000
    invoke-virtual {v2}, Lbqt;->e()I

    move-result v4

    invoke-interface {v3, v4}, Lbpr;->a(I)V

    :cond_1
    invoke-virtual {v2}, Lbqt;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lbqt;->i()Z

    move-result v3

    .line 22000
    iput-boolean v3, v0, Lbpo;->d:Z

    .line 18000
    :cond_2
    invoke-virtual {v2}, Lbqt;->d()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, Lbqk;->a()Lbpr;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lbqt;->e()I

    move-result v2

    invoke-interface {v3, v2}, Lbpr;->a(I)V

    .line 17000
    :cond_3
    const/4 v2, 0x1

    iput-boolean v2, v0, Lbpo;->c:Z

    .line 0
    iput-object v0, p0, Lbrb;->m:Lbpo;

    .line 23000
    iget-object v0, v1, Lbqu;->a:Lbrn;

    invoke-virtual {v0}, Lbrn;->b()V

    .line 0
    return-void

    :cond_4
    invoke-virtual {p0}, Lbrb;->a()Lbql;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Google Analytics 4.5.0/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is starting up. To enable debug logging on a device run:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbql;->d(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;)Lbrb;
    .locals 8

    invoke-static {p0}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lbrb;->i:Lbrb;

    if-nez v0, :cond_1

    const-class v1, Lbrb;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lbrb;->i:Lbrb;

    if-nez v0, :cond_0

    invoke-static {}, Lcad;->c()Lcac;

    move-result-object v0

    invoke-interface {v0}, Lcac;->b()J

    move-result-wide v2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    new-instance v5, Lbrd;

    invoke-direct {v5, v4}, Lbrd;-><init>(Landroid/content/Context;)V

    new-instance v4, Lbrb;

    invoke-direct {v4, v5}, Lbrb;-><init>(Lbrd;)V

    sput-object v4, Lbrb;->i:Lbrb;

    invoke-static {}, Lbpo;->b()V

    invoke-interface {v0}, Lcac;->b()J

    move-result-wide v6

    sub-long v2, v6, v2

    sget-object v0, Lbqd;->E:Lbqe;

    invoke-virtual {v0}, Lbqe;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v2, v6

    if-lez v0, :cond_0

    invoke-virtual {v4}, Lbrb;->a()Lbql;

    move-result-object v0

    const-string v4, "Slow initialization (ms)"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v4, v2, v3}, Lbql;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lbrb;->i:Lbrb;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static a(Lbra;)V
    .locals 2

    const-string v0, "Analytics service not created/initialized"

    invoke-static {p0, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lbra;->q()Z

    move-result v0

    const-string v1, "Analytics service not initialized"

    invoke-static {v0, v1}, La;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public static i()V
    .locals 0

    invoke-static {}, Lcox;->b()V

    return-void
.end method


# virtual methods
.method public final a()Lbql;
    .locals 1

    iget-object v0, p0, Lbrb;->e:Lbql;

    invoke-static {v0}, Lbrb;->a(Lbra;)V

    iget-object v0, p0, Lbrb;->e:Lbql;

    return-object v0
.end method

.method public final b()Lcox;
    .locals 1

    iget-object v0, p0, Lbrb;->j:Lcox;

    invoke-static {v0}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbrb;->j:Lcox;

    return-object v0
.end method

.method public final c()Lbqu;
    .locals 1

    iget-object v0, p0, Lbrb;->k:Lbqu;

    invoke-static {v0}, Lbrb;->a(Lbra;)V

    iget-object v0, p0, Lbrb;->k:Lbqu;

    return-object v0
.end method

.method public final d()Lbpo;
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbrb;->m:Lbpo;

    invoke-static {v0}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbrb;->m:Lbpo;

    .line 24000
    iget-boolean v0, v0, Lbpo;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 0
    :goto_0
    const-string v1, "Analytics instance not initialized"

    invoke-static {v0, v1}, La;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbrb;->m:Lbpo;

    return-object v0

    .line 24000
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Lbqt;
    .locals 1

    iget-object v0, p0, Lbrb;->l:Lbqt;

    invoke-static {v0}, Lbrb;->a(Lbra;)V

    iget-object v0, p0, Lbrb;->l:Lbqt;

    return-object v0
.end method

.method public final f()Lbqf;
    .locals 1

    iget-object v0, p0, Lbrb;->o:Lbqf;

    invoke-static {v0}, Lbrb;->a(Lbra;)V

    iget-object v0, p0, Lbrb;->o:Lbqf;

    return-object v0
.end method

.method public final g()Lbrt;
    .locals 1

    iget-object v0, p0, Lbrb;->n:Lbrt;

    invoke-static {v0}, Lbrb;->a(Lbra;)V

    iget-object v0, p0, Lbrb;->n:Lbrt;

    return-object v0
.end method

.method public final h()Lbrm;
    .locals 1

    iget-object v0, p0, Lbrb;->p:Lbrm;

    invoke-static {v0}, Lbrb;->a(Lbra;)V

    iget-object v0, p0, Lbrb;->p:Lbrm;

    return-object v0
.end method
