.class final Lbqv;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Z

.field private synthetic b:Lbqu;


# direct methods
.method constructor <init>(Lbqu;Z)V
    .locals 0

    iput-object p1, p0, Lbqv;->b:Lbqu;

    iput-boolean p2, p0, Lbqv;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lbqv;->b:Lbqu;

    .line 1000
    iget-object v0, v0, Lbqu;->a:Lbrn;

    .line 2000
    invoke-virtual {v0}, Lbrn;->g()V

    .line 0
    return-void
.end method
