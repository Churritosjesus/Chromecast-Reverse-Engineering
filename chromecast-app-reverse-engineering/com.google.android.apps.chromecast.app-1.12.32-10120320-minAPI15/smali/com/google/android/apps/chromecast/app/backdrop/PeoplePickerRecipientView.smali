.class public Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;
.super Lacb;
.source "PG"


# instance fields
.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Lacb;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->d:Landroid/os/Handler;

    .line 27
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 20
    invoke-super {p0, p1, p2, p3, p4}, Lacb;->onTextChanged(Ljava/lang/CharSequence;III)V

    return-void
.end method

.method private i()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 64
    .line 1442
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    const-class v3, Lada;

    invoke-interface {v0, v2, v1, v3}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 1443
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1444
    if-eqz v0, :cond_0

    .line 1448
    array-length v4, v0

    move v1, v2

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v5, v0, v1

    .line 1449
    invoke-interface {v5}, Lada;->g()Lacx;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1448
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 65
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 66
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lacx;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->b(Lacx;)V

    .line 68
    :cond_1
    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x6

    if-ne p2, v0, :cond_0

    .line 37
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->i()V

    .line 39
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lacb;->onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .prologue
    .line 59
    invoke-super/range {p0 .. p5}, Lacb;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 60
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->i()V

    .line 61
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 7

    .prologue
    .line 45
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 46
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 47
    iget-object v6, p0, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->d:Landroid/os/Handler;

    new-instance v0, Lasw;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lasw;-><init>(Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;Ljava/lang/CharSequence;III)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v6, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 55
    :cond_0
    return-void
.end method
