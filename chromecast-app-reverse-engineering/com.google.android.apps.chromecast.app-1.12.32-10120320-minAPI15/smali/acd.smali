.class final Lacd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field private synthetic a:Landroid/text/Spannable;


# direct methods
.method constructor <init>(Lacb;Landroid/text/Spannable;)V
    .locals 0

    .prologue
    .line 2028
    iput-object p2, p0, Lacd;->a:Landroid/text/Spannable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 2028
    check-cast p1, Lada;

    check-cast p2, Lada;

    .line 3032
    iget-object v0, p0, Lacd;->a:Landroid/text/Spannable;

    invoke-interface {v0, p1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    .line 3033
    iget-object v1, p0, Lacd;->a:Landroid/text/Spannable;

    invoke-interface {v1, p2}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    .line 3034
    if-ge v0, v1, :cond_0

    .line 3035
    const/4 v0, -0x1

    .line 3037
    :goto_0
    return v0

    .line 3036
    :cond_0
    if-le v0, v1, :cond_1

    .line 3037
    const/4 v0, 0x1

    goto :goto_0

    .line 3039
    :cond_1
    const/4 v0, 0x0

    .line 2028
    goto :goto_0
.end method
