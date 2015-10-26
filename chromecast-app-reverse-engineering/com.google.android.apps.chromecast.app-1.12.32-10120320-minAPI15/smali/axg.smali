.class final Laxg;
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
    .line 186
    iput-object p1, p0, Laxg;->a:Laxd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Laxg;->a:Laxd;

    .line 1029
    iget-object v0, v0, Laxd;->g:Laxn;

    .line 189
    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Laxg;->a:Laxd;

    .line 2029
    iget-object v0, v0, Laxd;->g:Laxn;

    .line 190
    invoke-interface {v0}, Laxn;->p()V

    .line 194
    :goto_0
    return-void

    .line 192
    :cond_0
    iget-object v0, p0, Laxg;->a:Laxd;

    .line 3029
    iput-object p1, v0, Laxd;->j:Laef;

    goto :goto_0
.end method
