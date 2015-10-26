.class final Ladj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lads;

.field private synthetic b:Ladi;


# direct methods
.method constructor <init>(Ladi;Lads;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Ladj;->b:Ladi;

    iput-object p2, p0, Ladj;->a:Lads;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 141
    :try_start_0
    iget-object v0, p0, Ladj;->b:Ladi;

    invoke-static {v0}, Ladi;->a(Ladi;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    iget-object v1, p0, Ladj;->a:Lads;

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
