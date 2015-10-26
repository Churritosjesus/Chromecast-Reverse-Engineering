.class final Lacc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lacb;


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lacc;->a:Lacb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 221
    iget-object v0, p0, Lacc;->a:Lacb;

    invoke-static {v0}, Lacb;->a(Lacb;)Landroid/text/TextWatcher;

    move-result-object v0

    if-nez v0, :cond_0

    .line 222
    iget-object v0, p0, Lacc;->a:Lacb;

    new-instance v1, Lacw;

    iget-object v2, p0, Lacc;->a:Lacb;

    .line 3463
    invoke-direct {v1, v2}, Lacw;-><init>(Lacb;)V

    .line 222
    invoke-static {v0, v1}, Lacb;->a(Lacb;Landroid/text/TextWatcher;)Landroid/text/TextWatcher;

    .line 223
    iget-object v0, p0, Lacc;->a:Lacb;

    iget-object v1, p0, Lacc;->a:Lacb;

    invoke-static {v1}, Lacb;->a(Lacb;)Landroid/text/TextWatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lacb;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 225
    :cond_0
    return-void
.end method
