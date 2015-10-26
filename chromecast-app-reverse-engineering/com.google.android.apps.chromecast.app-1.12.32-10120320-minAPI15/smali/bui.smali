.class final Lbui;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbue;

.field private synthetic b:I


# direct methods
.method constructor <init>(Lbuh;Lbue;I)V
    .locals 0

    iput-object p2, p0, Lbui;->a:Lbue;

    iput p3, p0, Lbui;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lbui;->a:Lbue;

    invoke-static {v0}, Lbue;->d(Lbue;)Lbtc;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbui;->a:Lbue;

    invoke-static {v0}, Lbue;->d(Lbue;)Lbtc;

    move-result-object v0

    iget v1, p0, Lbui;->b:I

    invoke-virtual {v0, v1}, Lbtc;->b(I)V

    :cond_0
    return-void
.end method
