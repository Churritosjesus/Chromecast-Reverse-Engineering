.class final Lbri;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbqg;

.field private synthetic b:Lbrh;


# direct methods
.method constructor <init>(Lbrh;Lbqg;)V
    .locals 0

    iput-object p1, p0, Lbri;->b:Lbrh;

    iput-object p2, p0, Lbri;->a:Lbqg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lbri;->b:Lbrh;

    iget-object v0, v0, Lbrh;->a:Lbrf;

    invoke-virtual {v0}, Lbrf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbri;->b:Lbrh;

    iget-object v0, v0, Lbrh;->a:Lbrf;

    const-string v1, "Connected to service after a timeout"

    invoke-virtual {v0, v1}, Lbrf;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lbri;->b:Lbrh;

    iget-object v0, v0, Lbrh;->a:Lbrf;

    iget-object v1, p0, Lbri;->a:Lbqg;

    invoke-static {v0, v1}, Lbrf;->a(Lbrf;Lbqg;)V

    :cond_0
    return-void
.end method
