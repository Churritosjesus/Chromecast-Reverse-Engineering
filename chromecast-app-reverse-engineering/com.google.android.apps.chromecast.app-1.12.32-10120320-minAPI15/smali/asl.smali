.class final Lasl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Lash;


# direct methods
.method constructor <init>(Lash;)V
    .locals 0

    .prologue
    .line 425
    iput-object p1, p0, Lasl;->a:Lash;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 2

    .prologue
    .line 429
    instance-of v0, p1, Ladq;

    if-eqz v0, :cond_0

    .line 430
    iget-object v0, p0, Lasl;->a:Lash;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 430
    sget v1, Lb;->F:I

    invoke-virtual {v0, v1}, Lm;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 436
    :goto_0
    iget-object v1, p0, Lasl;->a:Lash;

    invoke-static {v1, v0}, Lash;->a(Lash;Ljava/lang/String;)V

    .line 437
    iget-object v0, p0, Lasl;->a:Lash;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lash;->b(I)V

    .line 438
    return-void

    .line 433
    :cond_0
    iget-object v0, p0, Lasl;->a:Lash;

    .line 2612
    iget-object v0, v0, Lj;->y:Lm;

    .line 433
    sget v1, Lb;->G:I

    invoke-virtual {v0, v1}, Lm;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
