.class final Lbbp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbbn;


# direct methods
.method constructor <init>(Lbbn;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lbbp;->a:Lbbn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 123
    invoke-static {}, Ltz;->d()Luh;

    move-result-object v0

    invoke-static {}, Ltz;->c()Luh;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 124
    invoke-static {}, Ltz;->c()Luh;

    move-result-object v0

    invoke-static {v0}, Ltz;->a(Luh;)V

    .line 126
    :cond_0
    return-void
.end method
