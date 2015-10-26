.class final Lnp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lno;


# direct methods
.method constructor <init>(Lno;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lnp;->a:Lno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 122
    iget-object v0, p0, Lnp;->a:Lno;

    .line 1089
    iget v0, v0, Lno;->u:I

    .line 122
    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lnp;->a:Lno;

    invoke-static {v0, v2}, Lno;->a(Lno;I)V

    .line 125
    :cond_0
    iget-object v0, p0, Lnp;->a:Lno;

    .line 2089
    iget v0, v0, Lno;->u:I

    .line 125
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    .line 126
    iget-object v0, p0, Lnp;->a:Lno;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lno;->a(Lno;I)V

    .line 128
    :cond_1
    iget-object v0, p0, Lnp;->a:Lno;

    .line 3089
    iput-boolean v2, v0, Lno;->t:Z

    .line 129
    iget-object v0, p0, Lnp;->a:Lno;

    .line 4089
    iput v2, v0, Lno;->u:I

    .line 130
    return-void
.end method
