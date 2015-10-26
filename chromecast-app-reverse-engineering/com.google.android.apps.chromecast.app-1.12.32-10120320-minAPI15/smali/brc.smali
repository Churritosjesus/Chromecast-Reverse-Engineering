.class final Lbrc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field private synthetic a:Lbrb;


# direct methods
.method constructor <init>(Lbrb;)V
    .locals 0

    iput-object p1, p0, Lbrc;->a:Lbrb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbrc;->a:Lbrb;

    .line 1000
    iget-object v0, v0, Lbrb;->e:Lbql;

    .line 0
    if-eqz v0, :cond_0

    const-string v1, "Job execution failed"

    invoke-virtual {v0, v1, p2}, Lbql;->e(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
