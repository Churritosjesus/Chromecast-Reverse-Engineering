.class final Lcth;
.super Lcsz;


# instance fields
.field private final a:Lclt;

.field private final b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lclt;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Lcsz;-><init>()V

    iput-object p1, p0, Lcth;->a:Lclt;

    iput-object p2, p0, Lcth;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic a(Lcth;)Ls;
    .locals 1

    .prologue
    .line 0
    .line 1000
    iget-object v0, p0, Lcth;->a:Lclt;

    .line 2000
    iget-object v0, v0, Lclt;->e:Ls;

    .line 0
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lctd;)V
    .locals 2

    iget-object v0, p0, Lcth;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lctj;

    invoke-direct {v1, p0, p1, p2, p3}, Lctj;-><init>(Lcth;Ljava/lang/String;Ljava/lang/String;Lctd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/List;Lctd;)V
    .locals 2

    iget-object v0, p0, Lcth;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcti;

    invoke-direct {v1, p0, p2, p1, p3}, Lcti;-><init>(Lcth;Ljava/util/List;Ljava/lang/String;Lctd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
