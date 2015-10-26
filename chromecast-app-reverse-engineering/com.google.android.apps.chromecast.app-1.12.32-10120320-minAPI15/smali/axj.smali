.class final Laxj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Laxd;


# direct methods
.method constructor <init>(Laxd;)V
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Laxj;->a:Laxd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Laxj;->a:Laxd;

    .line 1029
    iget-object v0, v0, Laxd;->h:Laxn;

    .line 228
    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Laxj;->a:Laxd;

    .line 2029
    iget-object v0, v0, Laxd;->h:Laxn;

    .line 229
    invoke-interface {v0}, Laxn;->q()V

    .line 233
    :goto_0
    return-void

    .line 231
    :cond_0
    iget-object v0, p0, Laxj;->a:Laxd;

    .line 3029
    iput-object p1, v0, Laxd;->k:Laef;

    goto :goto_0
.end method
