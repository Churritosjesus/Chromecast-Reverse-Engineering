.class public final Lalk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field private a:Z

.field private b:I

.field private synthetic c:Landroid/widget/Spinner;

.field private synthetic d:Lall;

.field private synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DebugActivity;Landroid/widget/Spinner;Lall;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 253
    iput-object p2, p0, Lalk;->c:Landroid/widget/Spinner;

    iput-object p3, p0, Lalk;->d:Lall;

    iput-object p4, p0, Lalk;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 254
    const/4 v0, 0x0

    iput-boolean v0, p0, Lalk;->a:Z

    .line 255
    iget-object v0, p0, Lalk;->c:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    iput v0, p0, Lalk;->b:I

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 269
    iget-boolean v0, p0, Lalk;->a:Z

    if-nez v0, :cond_3

    iget v0, p0, Lalk;->b:I

    if-eq p3, v0, :cond_3

    .line 271
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lalk;->d:Lall;

    .line 272
    invoke-interface {v2}, Lall;->c()[Ljava/lang/String;

    move-result-object v2

    .line 270
    invoke-static {v0, v2}, Lcom/google/android/apps/chromecast/app/DebugActivity;->a(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 273
    iget-object v2, p0, Lalk;->d:Lall;

    invoke-interface {v2}, Lall;->d()[Ljava/lang/String;

    move-result-object v2

    if-ltz v0, :cond_2

    :goto_0
    aget-object v0, v2, v0

    .line 275
    iget-object v1, p0, Lalk;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 276
    iget-object v1, p0, Lalk;->d:Lall;

    invoke-interface {v1, v0}, Lall;->a(Ljava/lang/String;)V

    .line 278
    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    iget-object v0, p0, Lalk;->d:Lall;

    .line 280
    invoke-interface {v0}, Lall;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lalk;->d:Lall;

    .line 281
    invoke-interface {v1}, Lall;->d()[Ljava/lang/String;

    move-result-object v1

    .line 279
    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/DebugActivity;->a(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 282
    if-ltz v0, :cond_1

    .line 283
    const/4 v1, 0x1

    iput-boolean v1, p0, Lalk;->a:Z

    .line 284
    iget-object v1, p0, Lalk;->c:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    .line 290
    :cond_1
    :goto_1
    iget-object v0, p0, Lalk;->c:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    iput v0, p0, Lalk;->b:I

    .line 291
    return-void

    :cond_2
    move v0, v1

    .line 273
    goto :goto_0

    .line 288
    :cond_3
    iput-boolean v1, p0, Lalk;->a:Z

    goto :goto_1
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    .prologue
    .line 295
    return-void
.end method
