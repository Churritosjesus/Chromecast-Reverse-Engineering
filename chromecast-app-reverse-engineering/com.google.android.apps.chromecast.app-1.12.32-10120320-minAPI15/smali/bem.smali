.class final Lbem;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbfp;

.field private synthetic b:Lbff;


# direct methods
.method constructor <init>(Lbdu;Lbfp;Lbff;)V
    .locals 0

    .prologue
    .line 724
    iput-object p2, p0, Lbem;->a:Lbfp;

    iput-object p3, p0, Lbem;->b:Lbff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 727
    iget-object v0, p0, Lbem;->a:Lbfp;

    invoke-virtual {v0}, Lbfp;->a()I

    move-result v0

    .line 728
    iget-object v1, p0, Lbem;->a:Lbfp;

    .line 1061
    iget-boolean v1, v1, Lbfp;->i:Z

    .line 728
    if-nez v1, :cond_0

    if-nez v0, :cond_1

    .line 729
    :cond_0
    iget-object v0, p0, Lbem;->b:Lbff;

    invoke-interface {v0}, Lbff;->a()V

    .line 733
    :goto_0
    return-void

    .line 731
    :cond_1
    iget-object v1, p0, Lbem;->b:Lbff;

    invoke-interface {v1, v0}, Lbff;->a(I)V

    goto :goto_0
.end method
