.class final Lbtm;
.super Lbuv;


# instance fields
.field private synthetic g:Lbtl;


# direct methods
.method constructor <init>(Lbtl;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lbtm;->g:Lbtl;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbuv;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbtm;->g:Lbtl;

    .line 2000
    iget-object v1, v0, Lbtl;->e:Lbtr;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lbtl;->e:Lbtr;

    invoke-interface {v0}, Lbtr;->a()V

    .line 0
    :cond_0
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbtm;->g:Lbtl;

    .line 4000
    iget-object v1, v0, Lbtl;->d:Lbtq;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lbtl;->d:Lbtq;

    invoke-interface {v0}, Lbtq;->a()V

    .line 0
    :cond_0
    return-void
.end method
