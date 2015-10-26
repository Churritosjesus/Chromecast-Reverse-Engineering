.class final Lary;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldcj;

.field private synthetic b:Ldcj;

.field private synthetic c:Lart;


# direct methods
.method constructor <init>(Lart;Ldcj;Ldcj;)V
    .locals 0

    .prologue
    .line 277
    iput-object p1, p0, Lary;->c:Lart;

    iput-object p2, p0, Lary;->a:Ldcj;

    iput-object p3, p0, Lary;->b:Ldcj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    .line 281
    iget-object v0, p0, Lary;->c:Lart;

    invoke-static {v0}, Lart;->a(Lart;)Laqw;

    move-result-object v0

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v1

    .line 282
    iget-object v0, p0, Lary;->a:Ldcj;

    iget-object v2, v0, Ldcj;->i:[Ldcj;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 283
    iget-object v5, v4, Ldcj;->b:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, p0, Lary;->b:Ldcj;

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 1053
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lauq;->c(Ljava/lang/String;)Ldci;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iput-object v6, v5, Ldci;->a:Ljava/lang/Boolean;

    .line 284
    iget-object v5, p0, Lary;->c:Lart;

    iget-object v4, v4, Ldcj;->b:Ljava/lang/Integer;

    invoke-static {v5, v4}, Lart;->a(Lart;Ljava/lang/Integer;)V

    .line 282
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 286
    :cond_0
    iget-object v0, p0, Lary;->c:Lart;

    invoke-virtual {v0}, Lart;->notifyDataSetChanged()V

    .line 287
    iget-object v0, p0, Lary;->c:Lart;

    invoke-static {v0}, Lart;->a(Lart;)Laqw;

    move-result-object v0

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    .line 1549
    iget-object v0, v0, Lash;->d:Lasb;

    invoke-virtual {v0}, Lasb;->a()V

    .line 288
    return-void
.end method
