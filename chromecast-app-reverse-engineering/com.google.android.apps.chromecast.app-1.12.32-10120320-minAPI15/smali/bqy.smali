.class final Lbqy;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbsf;

.field private synthetic b:Lbqu;


# direct methods
.method constructor <init>(Lbqu;Lbsf;)V
    .locals 0

    iput-object p1, p0, Lbqy;->b:Lbqu;

    iput-object p2, p0, Lbqy;->a:Lbsf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbqy;->b:Lbqu;

    .line 1000
    iget-object v0, v0, Lbqu;->a:Lbrn;

    .line 0
    iget-object v1, p0, Lbqy;->a:Lbsf;

    invoke-virtual {v0, v1}, Lbrn;->a(Lbsf;)V

    return-void
.end method
